public class Dog{
    int DogAge;
    public Dog(String name){
        System.out.println("Passed name is:"+name);
    }
    public void setAge(int age){
        DogAge=age;
    }
    public int getAge(){
        System.out.println("dog`s age is"+ DogAge);
        return DogAge;
    }
    public static void main(String [] args){
        Dog yinu=new Dog("puppy");
        yinu.setAge(5);
        yinu.getAge();
        System.out.println("Variable name"+ yinu.DogAge);
    }
}