/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.controller;

import com.sg.classroster.dao.ClassRosterPersistenceException;
import com.sg.classroster.dao.ClassRosterDaoFileImpl;
import com.sg.classroster.dao.classRosterDao;
import com.sg.classroster.dto.Student;
import com.sg.classroster.service.ClassRosterServiceLayer;
import com.sg.classroster.ui.ClassRosterView;
import com.sg.classroster.ui.UserIO;
import com.sg.classroster.service.ClassRosterDataValidationException;
import com.sg.classroster.service.ClassRosterDuplicateIdException;
import com.sg.classroster.ui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author salajrawi
 */
public class ClassRosterController {
   
   private ClassRosterView view;
 // private classRosterDao dao ;
   private ClassRosterServiceLayer service;
  public ClassRosterController(ClassRosterServiceLayer service, ClassRosterView view) {
    this.service = service;
    this.view = view;
}
  public void run()
    {
        boolean keepGoing =true;
        int menuSelection=0;
        try{
        while(keepGoing)
        {
            menuSelection=getMenuSelection();
          
            switch(menuSelection)
            {
                case 1:
                    listStudents();
                    break;
                    case 2:
                   createStudent();
                    break;
                    case 3:
                   viewStudent();
                    break;
                    case 4:
                   removeStudent();
                    break;
                    case 5:
                    keepGoing =false;
                    break;
                    default:
                     unknownCommand();
            
                    
            }
        }
        exitMessage();   
         } catch (ClassRosterPersistenceException e) {
        view.displayErrorMessage(e.getMessage());
    }
    }
    private int getMenuSelection()
        {
        return view.printMenuAndGetSelection();

        }
   private void createStudent() throws ClassRosterPersistenceException {
        view.displayCreateStudentBanner();
        boolean hasErrors = false;
        do{
            Student currentStudent = view.getNewStudentInfo();
            try {
                service.createStudent(currentStudent);
            view.displayCreateSuccessBanner();
                hasErrors = false;
            } catch (ClassRosterDuplicateIdException | ClassRosterDataValidationException e) {
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
            }
        }while(hasErrors);
        //Student newStudent = view.getNewStudentInfo();
        //dao.addStudent(newStudent.getStudentId(), newStudent);
        //view.displayCreateSuccessBanner();
    }
    
private void listStudents() throws ClassRosterPersistenceException {
      List<Student> studentList = service.getAllStudents();
     
    view.displayStudentList(studentList);
    
}
  private void viewStudent() throws ClassRosterPersistenceException {
   String studentId = view.getStudentIdChoice();
     Student student = service.getStudent(studentId) ;
     view.displayStudent(student);
}

private void removeStudent() throws ClassRosterPersistenceException {
 view.displayRemoveStudentBanner();
    String studentId = view.getStudentIdChoice();
    service.removeStudent(studentId);
    view.displayRemoveSuccessBanner();    
}
    private void unknownCommand() {
    view.displayUnknownCommandBanner();
}

private void exitMessage() {
    view.displayExitBanner();
}
}