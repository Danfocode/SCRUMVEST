/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SCRUMVEST.ui;
import com.mycompany.SCRUMVEST.login.LoginService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import org.springframework.stereotype.Component;
@Component
public class MainViewController {
    @FXML private ScrollPane contentView;
    @FXML private VBox projectsMenu;
    @FXML private VBox groupsMenu;
    @FXML private VBox userStoriesMenu;
    @FXML private VBox tasksMenu;
    private final LoginService loginService;
    public MainViewController(LoginService loginService) {
        this.loginService = loginService;
    }
    @FXML
    private void switchToProjects() throws Exception {
        loadContent("../project/ProjectView.fxml");
        setActiveMenu(projectsMenu);
    }
    @FXML
    private void switchToGroups() throws Exception {
        loadContent("../group/GroupView.fxml");
        setActiveMenu(groupsMenu);
    }
    @FXML
    private void switchToUserStories() throws Exception {
        loadContent("../userstory/UserStoryView.fxml");
        setActiveMenu(userStoriesMenu);
    }
    @FXML
    private void switchToTasks() throws Exception {
        loadContent("../task/TaskView.fxml");
        setActiveMenu(tasksMenu);
    }
    private void loadContent(String fxmlPath) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        loader.setControllerFactory(c -> loginService.getSpringContext().getBean(c));
        contentView.setContent(loader.load());
    }
    private void setActiveMenu(VBox menu) {
        projectsMenu.getStyleClass().remove("active");
        groupsMenu.getStyleClass().remove("active");
        userStoriesMenu.getStyleClass().remove("active");
        tasksMenu.getStyleClass().remove("active");
        menu.getStyleClass().add("active");
    }
}