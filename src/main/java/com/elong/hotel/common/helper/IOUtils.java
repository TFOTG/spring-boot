package com.elong.hotel.common.helper;

import java.io.IOException;
import java.io.Writer;

public class IOUtils {

	public static void closeWriter(Writer... writer) {
		for (Writer io : writer) {
			try {
				if (io != null) {
					io.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
