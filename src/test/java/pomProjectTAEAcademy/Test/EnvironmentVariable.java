package pomProjectTAEAcademy.Test;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvironmentVariable {

    public static void environmentVariablesTest() {
        Dotenv dotenv = Dotenv.load();

        // Obtener las variables de entorno locales
        String localUser = dotenv.get("USER_NAME");
        String localPassword = dotenv.get("USER_PASSWORD");

        // Obtener las variables de entorno de Jenkins o del sistema
        String jenkinsUser = System.getenv("JENKINS_USER_NAME");
        String jenkinsPassword = System.getenv("JENKINS_USER_PASSWORD");

        // Comparar las variables y mostrar el resultado
        if (!localUser.equals(jenkinsUser)) {
            System.out.println("El valor de USER_NAME local y el de Jenkins no coinciden.");
            System.out.println("Local: " + localUser + " | Jenkins: " + jenkinsUser);
        } else {
            System.out.println("El valor de USER_NAME coincide.");
        }

        if (!localPassword.equals(jenkinsPassword)) {
            System.out.println("El valor de USER_PASSWORD local y el de Jenkins no coinciden.");
            System.out.println("Local: " + localPassword + " | Jenkins: " + jenkinsPassword);
        } else {
            System.out.println("El valor de USER_PASSWORD coincide.");
        }
    }
}