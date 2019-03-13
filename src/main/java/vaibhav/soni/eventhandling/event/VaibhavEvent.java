package vaibhav.soni.eventhandling.event;

public class VaibhavEvent {

    private String text;

    public VaibhavEvent(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
