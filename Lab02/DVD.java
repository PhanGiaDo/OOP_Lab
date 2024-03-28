public class DVD{
    private String id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getID(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getCategory(){
        return category;
    }

    public String getDirector(){
        return director;
    }

    public int getLength(){
        return length;
    }

    public double getCost(){
        return cost;
    }

    public DVD(String title){
        this.title = title;
    }

    public DVD(String category, String title, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DVD(String director,String category, String title, float cost){
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DVD(String id, String title, String category, String director, int length, float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
}
