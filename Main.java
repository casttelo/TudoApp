/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Main;
import Controller.ProjectController;
import Model.Project;
import Util.ConnectorFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws SQLException {
        //Criando uma nova conex�o com o BD
        Connection c;
        c = ConnectorFactory.GetConnection();
        c.close();
        ProjectController projectcontroller = new ProjectController();
        
        Project project = new Project();
        project.setName("projeto teste");
        project.setDescription("Description");
        projectcontroller.Save(project);
    }
}
