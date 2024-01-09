package main;

import java.util.Arrays;
import java.util.Iterator;

public class Bitmap {
	private final int m_width;
	private final int m_height;
	private final char m_components[];
	
	public Bitmap(int width, int height) {
		m_width = width;
		m_height = height;
		m_components = new char[width * height * 4];
	}
	
	public void clear(char shade) {
		Arrays.fill(m_components, shade);
	}
	
	public void drawPixel(int x, int y, char a, char r, char g, char b) {
		int index = (x + y * m_width) * 4;
		m_components[index] = a;
		m_components[index + 1] = r;
		m_components[index + 2] = g;
		m_components[index + 3] = b;
	}
	
	public void copyToIntArray(int[] dest) {
		for	(int i = 0; i < m_width * m_height; i++) {
			int a = ((int)m_components[i * 4]) << 24;
			int r = ((int)m_components[i * 4 + 1]) << 16;
			int g = ((int)m_components[i * 4 + 2]) << 8;
			int b = ((int)m_components[i * 4 + 3]);
		}
	}
	
}
