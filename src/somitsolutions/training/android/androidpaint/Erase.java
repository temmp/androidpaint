package somitsolutions.training.android.androidpaint;

import java.util.ArrayList;

import android.graphics.Path;

public class Erase extends Shape {
	
private ArrayList<Path>_erasegraphicspath;
	
	public Erase(){
		super();
		_erasegraphicspath = new ArrayList<Path>();
		strokeWidth = 8;
	}
	
	public ArrayList<Path> getGraphicsPath(){
		return _erasegraphicspath;
	}

}
