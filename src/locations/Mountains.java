package locations;

import interfaces.MessagesImpl;
import locations.Location;

public class Mountains extends Location {
    String[] placeDescription = new String[] {"эти"};
    int length = placeDescription.length;

    Mountains(String name) {
        super(name);
    }

    public void describe(){
        for(int i = 0; i < length; i++) {
            MessagesImpl message = new MessagesImpl();
            message.descriptionMessage(placeDescription, length, getName(), 1);
        }
    }
}
