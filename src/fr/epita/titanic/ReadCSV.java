package fr.epita.titanic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import fr.epita.titanic.Datahold;

public class ReadCSV {
	public List<Datahold> readAll() throws FileNotFoundException, ParseException {
		List<Datahold> out = new ArrayList<Datahold>();
		Scanner sc = new Scanner(new FileReader("/Users/admin/Downloads/input.csv"));
		String header = sc.nextLine();
		while (sc.hasNext()) {
			String[] line = sc.nextLine().split(",");

			Datahold v = new Datahold();
			v.setSurvived(Integer.valueOf(line[0]));
			v.setPclass(Integer.valueOf(line[1]));
			v.setName(line[2]);
			v.setSex(line[3]);
			v.setAge(Double.valueOf(line[4]));
			v.setSiblings(Integer.valueOf(line[5]));
			v.setParents(Integer.valueOf(line[6]));
			v.setFare(Double.valueOf(line[7]));
			out.add(v);
		}

		return out;
		
		
	}

}
