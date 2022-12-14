/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.classroster;


import com.sg.classroster.controller.ClassRosterController;
import com.sg.classroster.dao.ClassRosterDaoFileImpl;
import com.sg.classroster.ui.ClassRosterView;
import com.sg.classroster.ui.UserIO;
import com.sg.classroster.ui.UserIOConsoleImpl;
import com.sg.classroster.dao.ClassRosterDao;

/**
 *
 * @author lionwife
 */
public class ClassRoster {

    public static void main(String[] args) {
     UserIO myIo = new UserIOConsoleImpl();
    ClassRosterView myView = new ClassRosterView(myIo);
    ClassRosterDao myDao = new ClassRosterDaoFileImpl();
    ClassRosterController controller =
            new ClassRosterController(myDao, myView);
    controller.run();
    }   
}
