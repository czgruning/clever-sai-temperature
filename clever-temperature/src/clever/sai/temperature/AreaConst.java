package clever.sai.temperature;

import java.util.HashMap;
import java.util.Map;

public class AreaConst {

	private Map<Integer, String> area_map = new HashMap<Integer, String>();
	private Map<String, String> diff_factor_map = new HashMap<String, String>();
	private Map<String, String> spss_factor_map = new HashMap<String, String>();

	/**
	 * 高家沟、马家峪、下枣林、关上、暖泉、南恒
	 */
	private static final String GJG = "GaoJiaGou";
	private static final String MJY = "MaJiaYu";
	private static final String XZL = "XiaZaoLin";
	private static final String GS = "GuanShang";
	private static final String NQ = "NuanQuan";
	private static final String NH = "NanHeng";

	public AreaConst() {
	}

	public AreaConst(Map<Integer, String> area_map, Map<String, String> diff_factor_map,
			Map<String, String> spss_factor_map) {
		this.area_map = area_map;
		this.diff_factor_map = diff_factor_map;
		this.spss_factor_map = spss_factor_map;
	}

	public Map<Integer, String> getAreaMap() {
		area_map.put(0, GJG);
		area_map.put(1, MJY);
		area_map.put(2, XZL);
		area_map.put(3, GS);
		area_map.put(4, NQ);
		area_map.put(5, NH);
		return area_map;
	}

	public Map<String, String> getDiff_factor_map() {
		diff_factor_map.put(GJG, "1,1,1,3");
		diff_factor_map.put(MJY, "1,-2,1,0");
		diff_factor_map.put(XZL, "1,-2,1,1");
		diff_factor_map.put(GS, "1,-4,1,-1");
		diff_factor_map.put(NQ, "1,-1,1,2");
		diff_factor_map.put(NH, "1,4,1,1");
		return diff_factor_map;
	}

	public Map<String, String> getSpss_factor_map() {
		diff_factor_map.put(GJG, "1.050,-2.112,1.027,27.730");
		diff_factor_map.put(MJY, "1.032,-21.999,1.006,-3.293");
		diff_factor_map.put(XZL, "1.035,-19.544,0.966,15.840");
		diff_factor_map.put(GS, "1.026,-36.877,0.966,2.197");
		diff_factor_map.put(NQ, "1.038,-5.871,1.032,11.983");
		diff_factor_map.put(NH, "0.918,30.493,0.980,13.385");
		return spss_factor_map;
	}

}
