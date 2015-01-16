public class AnimalShelterQueue {
	private Animal first;
	private Animal last;
	
/**
 * adds new Animal object to queue
 * @param name value for name variable
 * @param animalType value for AnimalType variable
 */
	public void enqueue(String name,String animalType) {
		Animal newAnimal = new Animal(name,animalType);
		if (first == null) {
			first = newAnimal;
			last = newAnimal;
		} else {
			last.next = newAnimal;
			last = newAnimal;
		}
	}

	/**
	 * removes Animal object from queue
	 * @return name of removed Animal
	 */
	public String dequeu() {
		if (first == null) {
			throw new IllegalStateException("Shelter is empty!");
		} else {
			String animalName = first.name;
			first = first.next;
			return animalName;
		}
	}

	/**
	 * removes the first animal object(moving from first) whose type is cat
	 * @return name of removed animal
	 */
	public String dequeueCat() {
		String animalName = null;
		if (first == null) {
			throw new IllegalStateException("Shelter is empty!");
		} else {
			if (first.animalType.compareTo("cat") == 0) {
				animalName = first.name;
				first = first.next;
			} else {
				Animal current = first;
				Animal previous = first.next;
				while (current != null) {
					if (current.animalType.compareTo("cat") == 0) {
						animalName = current.name;
						previous.next = current.next;
						break;
					}
				}
			}
		}
		return animalName;
	}

	/**
	 * removes the first animal object(moving from first) whose type is dog
	 * @return name of removed animal
	 */
	public String dequeueDog() {
		String animalName = null;
		if (first == null) {
			throw new IllegalStateException("Shelter is empty!");
		} else {
			if (first.animalType.compareTo("dog") == 0) {
				animalName = first.name;
				first = first.next;
			} else {
				Animal current = first;
				Animal previous = first.next;
				while (current != null) {
					if (current.animalType.compareTo("cat") == 0) {
						animalName = current.name;
						previous.next = current.next;
						break;
					}
				}
			}
		}
		return animalName;
	}
	
	private class Animal {
		private String name;
		private String animalType;
		private Animal next;

		/**
		 * constructor method for creating Animal objects
		 * @param name value for name variable
		 * @param animalType value for AnimalType variable
		 */
		public Animal(String name, String animalType) {
			this.name = name;
			this.animalType = animalType;
			next = null;
		}
	}
}
