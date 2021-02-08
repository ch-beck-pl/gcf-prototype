package pl.beck.func2;

import com.google.cloud.functions.Context;
import com.google.cloud.functions.RawBackgroundFunction;

public class Func2 implements RawBackgroundFunction {
	@Override
	public void accept(String json, Context context) throws Exception {
		System.out.println(json);
	}
}
