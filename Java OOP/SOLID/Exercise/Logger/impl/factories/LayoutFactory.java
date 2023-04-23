package JavaOOP.SOLID.Logger.impl.factories;

import JavaOOP.SOLID.Logger.impl.layouts.SimpleLayout;
import JavaOOP.SOLID.Logger.impl.layouts.XmlLayout;
import JavaOOP.SOLID.Logger.interfaces.Factory;
import JavaOOP.SOLID.Logger.interfaces.Layout;

public class LayoutFactory implements Factory<Layout> {

    @Override
    public Layout produce(String input) {
        Layout layout = null;

        if (input.equals("SimpleLayout")) {
            layout = new SimpleLayout();
        } else if (input.equals("XmlLayout")) {
            layout = new XmlLayout();
        }

        return layout;
    }
}