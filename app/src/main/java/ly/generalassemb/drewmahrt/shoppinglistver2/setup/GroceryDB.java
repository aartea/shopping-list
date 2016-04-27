package ly.generalassemb.drewmahrt.shoppinglistver2.setup;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aaron on 4/26/2016.
 */
public class GroceryDB extends SQLiteOpenHelper {

    //Database version number
    public static final int DATABASE_VERSION = 1;

    //Database name
    public static final String DATABASE_NAME = "Grocery.db";

    //Creation string
    public static final String SQL_CREATE_GROCERY_TABLE = "CREATE TABLE grocery ( id INTEGER PRIMARY KEY, name TEXT, description TEXT" +
            "price REAL, type TEXT )";

    //Drop Table (Destroy)

    public GroceryDB(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    public static final String SQL_DROP_GROCERY_TABLE = "DROP TABLE IF EXISTS grocery";
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insert(int id, String name, String description){
        SQLiteDatabase db = getWritableDatabase();
        //Key value pairs - names of the columns and the value we want to insert in our entry
        //Like a bundle or intent -- putExtra; or, another metaphor: a hashmap.
        ContentValues values = new ContentValues();
        values.put("id", id);
        values.put("name", name);
        values.put("year", year);

        db.insert("games", null, values);
    }














}
