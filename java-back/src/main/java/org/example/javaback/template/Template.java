package org.example.javaback.template;

public class Template {

    private String anExample;

    public Template(String anExample) {
        this.anExample = anExample;
    }

    public String getAnExample() {
        return anExample;
    }

    public void setAnExample(String anExample) {
        this.anExample = anExample;
    }

    public String toString() {
        return "This is the example word from Template: " + this.anExample;
    }

}
