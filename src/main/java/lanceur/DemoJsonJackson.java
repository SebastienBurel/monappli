package lanceur;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.objis.demojson.domaine.Employe;

public class DemoJsonJackson {

	public static void main(String[] args) throws IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		Employe employe1 = new Employe("BA", "Amadou");
		Employe employe3 = new Employe("Toto", "Tata");
		Employe employe4 = new Employe("Popo", "papa");
		
		ArrayList<Employe>employes = new ArrayList<Employe>();
		employes.add(employe1);
		employes.add(employe3);
		employes.add(employe4);
		
		//Object vers fichier JSON
		//avec 1 objet unique
		File resultFile = new File("employe.json");
		mapper.writeValue(resultFile, employe1);
		//avec 1 table
		File resultFile2 = new File("employes.json");
		mapper.writeValue(resultFile2, employes);
		
		
		//JSON from file to Object	
		//avec 1 objet unique
		Employe employe2 = mapper.readValue(new File("employe2.json"), Employe.class);
		System.out.println(employe2);
		//avec 1 table
		ArrayList<Employe>employes2 = mapper.readValue(new File("employes.json"), ArrayList.class);
		System.out.println(employes2);
		JOptionPane.showMessageDialog(null, employes2); //pour afficher une fenetre popup
		
		
		
		
		
	}

}
