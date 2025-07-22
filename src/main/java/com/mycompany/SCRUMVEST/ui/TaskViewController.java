/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SCRUMVEST.ui;

import com.mycompany.SCRUMVEST.login.LoginService;
import com.mycompany.SCRUMVEST.task.TaskService;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import org.springframework.stereotype.Component;
@Component
public class TaskViewController {
    @FXML private TableView<Object> taskTable;
    @FXML private TextField searchField;
    @FXML private ComboBox<String> statusFilter;
    @FXML private Button addTaskButton;
    @FXML private Button assignedTasksButton;
    private final LoginService loginService;
    private final TaskService taskService;
    public TaskViewController(LoginService authService, TaskService taskService) {
        this.loginService = authService;
        this.taskService = taskService;
    }
    @FXML
    private void initialize() {
        if (loginService.isProductOwner()) {
            addTaskButton.setVisible(true);
        }
        // Configurar tabla y filtros
    }
    @FXML
    private void addTask() {
        // Lógica para agregar tarea
    }
    @FXML
    private void showAssignedTasks() {
        // Filtrar tareas asignadas al usuario
    }
}