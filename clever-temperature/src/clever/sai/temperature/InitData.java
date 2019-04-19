package clever.sai.temperature;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

public class InitData {

	private static ArrayList<Object> area = null;
	private static HashMap<Object, Object> info_map = null;
	private static HashMap<Object, Object> diff_factor_map = null;
	private static HashMap<Object, Object> spss_factor_map = null;
	private static final String info_config = "config/info.properities";
	private static final String diff_config = "config/diff_factor.properities";
	private static final String spss_config = "config/spss_factor.properities";

	/**
	 * 高家沟、马家峪、下枣林、关上、暖泉、南恒
	 */
//	private static final String GJG = "GaoJiaGou";
//	private static final String MJY = "MaJiaYu";
//	private static final String XZL = "XiaZaoLin";
//	private static final String GS = "GuanShang";
//	private static final String NQ = "NuanQuan";
//	private static final String NH = "NanHeng";

	public static void init() {
		area = new ArrayList<Object>();
		info_map = new HashMap<Object, Object>();
		diff_factor_map = new HashMap<Object, Object>();
		spss_factor_map = new HashMap<Object, Object>();
		Properties areaProperity = new Properties();
		Properties diffProperity = new Properties();
		Properties spssProperity = new Properties();

		try {
			// areaProperity.load(new FileInputStream(info_config));
			areaProperity.load(inputTransfer(info_config));
			// diffProperity.load(new FileInputStream(diff_config));
			diffProperity.load(inputTransfer(diff_config));
			// spssProperity.load(new FileInputStream(spss_config));
			spssProperity.load(inputTransfer(spss_config));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String key = "";
		String value = "";
		for (Entry<Object, Object> entry : areaProperity.entrySet()) {
			key = entry.getKey().toString();
			value = entry.getValue().toString();
			info_map.put(key, value);
			if (key.equals("area")) {
				String[] areas = value.split(",");
				for (int i = 0; i < areas.length; i++) {
					area.add(areas[i]);
				}
			}
		}
		for (Entry<Object, Object> entry : diffProperity.entrySet()) {
			key = entry.getKey().toString();
			value = entry.getValue().toString();
			diff_factor_map.put(key, value);
		}
		for (Entry<Object, Object> entry : spssProperity.entrySet()) {
			key = entry.getKey().toString();
			value = entry.getValue().toString();
			spss_factor_map.put(key, value);
		}
		
		System.out.println("initialize data finished");

	}

	private static BufferedReader inputTransfer(String filePath) throws IOException {
		InputStream in = new FileInputStream(filePath);
		BufferedReader bfr = new BufferedReader(new InputStreamReader(in, "UTF-8"));
		return bfr;
	}

	public static void main(String [] args) {
		InitData.init();
	}

}
