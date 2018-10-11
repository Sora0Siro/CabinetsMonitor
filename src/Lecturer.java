interface Specialization
{
    void specialty();
    void projectorNeed(boolean value);
}

public class Lecturer
{
    private String v_specialty;
    private boolean v_wantProjector;

    Lecturer()
    {
        v_specialty = "none";
        v_wantProjector = false;
    }

    Lecturer(String specialty, boolean wantProjector)
    {
        v_specialty = specialty;
        v_wantProjector = wantProjector;
    }
}