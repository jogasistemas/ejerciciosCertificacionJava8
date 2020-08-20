public class Door {


    public void open ()
    {
        push();     // Since this is just a generic "Door" we will assume the simplest opening method.
        // The actual open method must be overridden by a subclass, as we see below.
        // Later, a way to force a subclass to override a method will be demonstrated --
        // but for this simple example will do for now.
    }

    public void push()
    {
        System.out.println("Super Class");
    }
}
