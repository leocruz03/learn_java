package src;

public class Alumno 
{
    int id;
    String name;
    String lastName;

    public static void main(String[] args)
    {
        Alumno alu1 = new Alumno();    
        Alumno alu2 = new Alumno(5, "leonardo", "de la cruz");
        System.out.println("el id del alumno 2 es: " + alu2.getId());
        
        alu1.setId(8);
        alu1.setName("jose");
        alu1.setLastName("ardila");
        System.out.println(alu1.id);
    }

    public Alumno() 
    {}

    public Alumno(int id, String name, String lastName) 
    {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
    
    // getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
