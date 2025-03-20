package Pet;

public record Food(Pet pet) {
	public void eat(String food) {
		System.out.println(pet.petName() + " ate " + food);
	}
}
