package id.ac.unp.ft.informatika.baseadapter;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Item item = new Item("Buku", "Buku programming");
        Item item2 = new Item("Laptop", "Laptop Gaming");
        Item item3 = new Item("Computer", "Server computing");
        Item item4 = new Item("Smartphone", "Handphone Android terbaru");
        Item item5 = new Item("Mouse", "Mouse Wireless");
        Item item6 = new Item("Keyboard", "Mechanical Keyboard");
        Item item7 = new Item("Headset", "Headset Gaming");
        Item item8 = new Item("Monitor", "Monitor 24 inch Full HD");
        Item item9 = new Item("Printer", "Printer Laser");
        Item item10 = new Item("Flashdisk", "USB Flashdisk 64GB");
        Item item11 = new Item("Webcam", "Webcam HD untuk video call");
        Item item12 = new Item("Speaker", "Speaker Bluetooth portable");
        Item item13 = new Item("Router", "Router WiFi dual-band");
        Item item14 = new Item("Power Bank", "Power Bank 10000mAh");
        Item item15 = new Item("External HDD", "Harddisk eksternal 1TB");

        List<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);
        items.add(item10);
        items.add(item11);
        items.add(item12);
        items.add(item13);
        items.add(item14);
        items.add(item15);

        ItemAdapter itemAdapter = new ItemAdapter(this, items);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemAdapter);

    }
}
