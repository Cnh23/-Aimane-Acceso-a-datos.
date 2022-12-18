package jsonAimane;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class FichJson1 {
    final static String RUTA_FICHERO = "C:\\Users\\aiman\\Desktop\\Acceso a datos\\Ficheros\\";
    public static void main(String[] args) {
        JsonObject objetoJson = new JsonObject();
        objetoJson.addProperty("Coche", "Rojo");
        objetoJson.addProperty("Temperatura", 22.5);
        objetoJson.addProperty("año", 2010);

        JsonObject objetoJson2 = new JsonObject();
        objetoJson2.addProperty("Hola", "Mundo");

        //Insertamos el obj2 en obj1
        objetoJson.add("Mensaje", objetoJson2);

        JsonArray jsonaArrayMeses = new JsonArray();
        jsonaArrayMeses.add("Enero");
        jsonaArrayMeses.add("Febrero");
        jsonaArrayMeses.add("Marzo");

        //Insertamos el array en json1
        objetoJson.add("Meses", jsonaArrayMeses);
        System.out.println("Obj json= "+objetoJson);

        /*Volcar objeto json a fichero llamado objeto.json */
            /*java.nio */
    Path path = Paths.get(RUTA_FICHERO+"objeto.json");
    try {
        Files.write(path, objetoJson.toString().getBytes());
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
}
