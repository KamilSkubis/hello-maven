package pl.edu.agh.mwo.hellomaven;

import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;
import java.util.Random;
import java.util.Scanner;

/**
 * Simple main application.
 */
public class App {

    public static void main(String[] args) {

        final int width = 120;
        final int height = 20;

        IRender render = new Render();
        IContextBuilder builder = render.newBuilder();
        builder.width(width).height(height);
        builder.element(new PseudoText("Hello World"));
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
        System.out.println(s);

    }

    /**
     * Method will return random number.
     * @return random integer
     */
    public int getRandomNumber() {
        // chosen by fair dice roll.
        // guaranteed to be random
        final int number = 4;
        return number;
    }
}
