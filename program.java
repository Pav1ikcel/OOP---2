/*
// Интерфейс, определяющий метод получения скорости звука
interface Soundable {
    double getSoundSpeed();
}

// Интерфейс, определяющий метод получения скорости бега
interface Runnable {
    double getRunningSpeed();
}

// Интерфейс, определяющий метод получения скорости полета
interface Flyable {
    double getFlyingSpeed();
}

// Интерфейс, определяющий метод получения скорости плавания
interface Swimable {
    double getSwimmingSpeed();
}

// Реализация интерфейса Soundable
class Dog implements Soundable {
    public double getSoundSpeed() {
        return 343.2; // Скорость звука в воздухе при 20°C
    }
}

// Реализация интерфейса Soundable
class Whale implements Soundable {
    public double getSoundSpeed() {
        return 1500.0; // Скорость звука в воде
    }
}

// Реализация интерфейса Runnable
class Cheetah implements Runnable {
    public double getRunningSpeed() {
        return 98.0; // Скорость бега гепарда в километрах в час
    }
}

// Реализация интерфейса Runnable
class Horse implements Runnable {
    public double getRunningSpeed() {
        return 70.0; // Скорость бега лошади в километрах в час
    }
}

// Реализация интерфейса Flyable
class Eagle implements Flyable {
    public double getFlyingSpeed() {
        return 160.0; // Скорость полета орла в километрах в час
    }
}

// Реализация интерфейса Flyable
class Parrot implements Flyable {
    public double getFlyingSpeed() {
        return 30.0; // Скорость полета попугая в километрах в час
    }
}

// Реализация интерфейса Swimable
class Dolphin implements Swimable {
    public double getSwimmingSpeed() {
        return 60.0; // Скорость плавания дельфина в километрах в час
    }
}

// Реализация интерфейса Swimable
class Penguin implements Swimable {
    public double getSwimmingSpeed() {
        return 8.0; // Скорость плавания пингвина в километрах в час
    }
}

// Класс Doctor
class Doctor {
    // Поведение врача
    public void treatAnimal(Animal animal) {
        // Реализация лечения животного
        System.out.println("Врач лечит животное: " + animal.getClass().getSimpleName());
    }
}

// Класс Nurse
class Nurse {
    // Поведение медсестры
    public void feedAnimal(Animal animal) {
        // Реализация кормления животного
        System.out.println("Медсестра кормит животное: " + animal.getClass().getSimpleName());
    }
}

// Класс ветеринарной клиники
class VeterinaryClinic {
    private List<Animal> animals;
    
    public VeterinaryClinic(List<Animal> animals) {
        this.animals = animals;
    }
    
    // Метод для получения всех бегающих животных
    public List<Runnable> getRunners() {
        List<Runnable> runners = new ArrayList<>();
        
        for (Animal animal : animals) {
            if (animal instanceof Runnable) {
                runners.add((Runnable) animal);
            }
        }
        
        return runners;
    }
    
    // Метод для получения всех плавающих животных
    public List<Swimable> getSwimmers() {
        List<Swimable> swimmers = new ArrayList<>();
        
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                swimmers.add((Swimable) animal);
            }
        }
        
        return swimmers;
    }
    
    // Метод для получения всех говорящих животных
    public List<Soundable> getSpeakers() {
        List<Soundable> speakers = new ArrayList<>();
        
        for (Animal animal : animals) {
            if (animal instanceof Soundable) {
                speakers.add((Soundable) animal);
            }
        }
        
        return speakers;
    }
    
    // Метод для получения всех летающих животных
    public List<Flyable> getFlyers() {
        List<Flyable> flyers = new ArrayList<>();
        
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                flyers.add((Flyable) animal);
            }
        }
        
        return flyers;
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        
        animals.add(new Dog());
        animals.add(new Whale());
        animals.add(new Cheetah());
        animals.add(new Horse());
        animals.add(new Eagle());
        animals.add(new Parrot());
        animals.add(new Dolphin());
        animals.add(new Penguin());
        
        VeterinaryClinic clinic = new VeterinaryClinic(animals);
        
        List<Runnable> runners = clinic.getRunners();
        System.out.println("Б

 */