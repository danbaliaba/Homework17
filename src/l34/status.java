package l34;

public enum status {
    init("новая"),
    inProgress("в процессе"),
    ending("завершена");

    private final String object;

    status(String object)
    {
        this.object = object;
    }

    public String getObject(){
        return this.object;
    }
}

