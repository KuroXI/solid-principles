package Pet;

public record Sound(Pet pet) {
	public void makeSound(String sound) {
		System.out.println(pet.petName() + " make a " + sound);
	}
}
