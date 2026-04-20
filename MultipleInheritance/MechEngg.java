package MultipleInheritance;

public interface MechEngg {
  default void DoPracticle() {
	System.out.println("Mechanical Enginner mandatory to do practicles");
}
}
