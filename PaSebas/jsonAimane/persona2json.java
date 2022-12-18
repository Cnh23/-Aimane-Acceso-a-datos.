package jsonAimane;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class persona2json {

    public static void main(String[] args) {
        //PASAR DE LISTA A JSON Y VICEVERSA.
        Persona pers1 = new Persona("pepe", "Pérez", 50, Arrays.asList("Esgrima", "Futbol", "Boxeo"));
        Persona pers2 = new Persona("Paco", "Jones", 15, Arrays.asList("WWE", "LOL", "Petanca", "Programar"));
    
        List<Persona> listapersonasOut = Arrays.asList(pers1, pers2);

        System.out.println("ListaPersonas= "+listapersonasOut);
        //Crear objeto Json
        Gson objGson = new Gson();
        //Convertir a json
        String jsonPersonas = objGson.toJson(listapersonasOut);
        System.out.println("json final = "+jsonPersonas);

        String json2 = "[{\"nombre\":\"pepe\",\"apellido\":\"Pérez\",\"edad\":50,\"aficiones\":[\"Esgrima\",\"Futbol\",\"Boxeo\"]},{\"nombre\":\"Paco\",\"apellido\":\"Jones\",\"edad\":15,\"aficiones\":[\"WWE\",\"LOL\",\"Petanca\",\"Programar\"]}]";
        
        List<Persona> listapersonasin = objGson.fromJson(json2, new TypeToken<List<Persona>>(){}.getType());

        System.out.println("\nInvertido = "+listapersonasin);
    }

}
