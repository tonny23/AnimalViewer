package com.example.animalviewer.dummy;

import com.example.animalviewer.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class AnimalContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Animal> ITEMS = new ArrayList<Animal>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Animal> ITEM_MAP = new HashMap<String, Animal>();

    private static final int COUNT = 25;

    static {
        // Add some animals.
        addItem(new Animal("1", "Giraffe", R.drawable.giraffe));
        addItem(new Animal("2", "Frog", R.drawable.frog));
        addItem(new Animal("3", "Monkey", R.drawable.monkey));
    }

    private static void addItem(Animal item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Animal {
        public final String id;
        public final String name;
        public final int imageRes;

        public Animal(String id, String name, int imageRes) {
            this.id = id;
            this.name = name;
            this.imageRes = imageRes;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getImageRes() {
            return imageRes;
        }

    }
}
