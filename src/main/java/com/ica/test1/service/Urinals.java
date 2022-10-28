package com.ica.test1.service;

import org.springframework.stereotype.Service;

/**
 * 
 * <p>
 * This is the class
 * </p>
 * 
 * @author ramrushendranathgulla
 *
 */
@Service
public class Urinals {

	/**
	 * 
	 * @param str
	 * @return
	 */
	boolean goodString(String str) { // checks to see if valid string
		String[] s = str.split("");
		boolean isValid = true;
		int len = s.length;
		for (int i = 0; i < len - 1; i++) {
			int a = Integer.parseInt(String.valueOf(s[i]));
			int b = Integer.parseInt(String.valueOf(s[i + 1]));
			if (a == 1 && b == 1) {
				isValid = false;
				break;
			}
		}
		return isValid;
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public int countUrinals(String str) {
		Urinals obj = new Urinals();
		boolean isvalid = obj.goodString(str);
		if (!isvalid)
			return -1;
		String[] s = str.split("");
		int count = 0;
		int len = s.length;
		int status[] = new int[len];
		for (int i = 0; i < len; i++) {
			status[i] = Integer.parseInt(String.valueOf(s[i]));
		}
		if (len == 1) {
			if (status[0] == 0) {
				count = 1;
				status[0] = 1;
			}
		} else {
			int i = 0;
			if (status[i] == 0 && status[i + 1] != 1) {
				status[i] = 1;
				count++;
			}
			for (i = 1; i < len - 1; i++) {
				if (status[i] == 0 && status[i - 1] != 1 && status[i + 1] != 1) {
					status[i] = 1;
					count++;
				}
			}
			if (status[i] == 0 && status[i - 1] != 1) {
				count++;
				status[i] = 1;
			}
		}
		return count;
	}

}