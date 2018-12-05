
public class Task {

    private String name;
    private int quickly;
    private int important;
    private int quarter;

    public Task(String name, int quickly, int important) {
        this.name = name;
        this.quickly = quickly;
        this.important = important;
        setQuarter();
    }

    private void setQuarter() {
        if (important>0)
            {if (quickly>0) quarter = 3; else quarter = 4;}
            else
            {if (quickly>0) quarter = 2; else quarter = 1;}
    }

    public String getName() {
        return name;
    }

    public int getQuickly() {
        return quickly;
    }

    public int getImportant() {
        return important;
    }

    public int getQuarter() {
        return quarter;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", quickly=" + quickly +
                ", important=" + important +
                ", quarter=" + quarter +
                '}';
    }
}
