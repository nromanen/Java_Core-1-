package Zoo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

class CompareZooByName implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		return o1.name.compareTo(o2.name);
	}

		
	}

public class Zoo {
	private String monk;
	private static HashSet<Animal> animals = new HashSet<>();
	
	public String getMonc() {
		return monk;
	}
	public void setMonc(String monc) {
		this.monk = monc;
	}

	public ArrayList<Animal> SortedByName(){
		ArrayList<Animal> animallist = new ArrayList<Animal>(animals);
		Collections.sort(animallist, new CompareZooByName());
		return animallist;
			
	}
		public static void main(String[] args){
			Animal z1 = new Animal();
			z1.setName("Lion");
			Animal z2 = new Animal();
			z2.setName("Monkey");
			Animal z3 = new Animal();
			z3.setName("Au");
			
			animals.add(z1);
			animals.add(z2);
			animals.add(z3);
			
			Zoo z0 = new Zoo();
			
			System.out.println(z0.SortedByName());
		}
		}
