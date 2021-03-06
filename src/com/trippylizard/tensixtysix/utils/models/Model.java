package com.trippylizard.tensixtysix.utils.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.lwjgl.util.vector.Vector3f;

public class Model {
	public List<Vector3f> vertices = new ArrayList<Vector3f>();
	public List<Vector3f> normals = new ArrayList<Vector3f>();
	public List<Face> faces = new ArrayList<Face>();
	
	public double getMaxX() {
		List<Double> xposes = new ArrayList<Double>();
		
		for (Vector3f v : vertices) {
			xposes.add((double) v.getX());
		}
		
		return Collections.max(xposes);
	}
	
	public double getMaxZ() {
		List<Double> zposes = new ArrayList<Double>();
		
		for (Vector3f v : vertices) {
			zposes.add((double) v.getZ());
		}
		
		return Collections.max(zposes);
	}

	public double getMaxY() {
		List<Double> yposes = new ArrayList<Double>();
		
		for (Vector3f v : vertices) {
			yposes.add((double) v.getY());
		}
		
		return Collections.max(yposes);
	}
}
