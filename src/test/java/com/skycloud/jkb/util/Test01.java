package com.skycloud.jkb.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class Test01 {

	@Test
	public void test01() {
		// String ss = "aa\t\t" + "bbb";
		// System.out.println(ss);
		//
		// System.out.println(ss.contains("\t"));
		// System.out.println(ss.contains(" "));
		//
		// // System.out.println(ss.split(" ")[0]);
		// // System.out.println(ss.split(" ")[1]);
		//
		// System.out.println(ss.split("\t+")[0]);
		// System.out.println(ss.split("\t+")[1]);

		String key = "vfs.fs.size[/boot,pfree]";
		// $1上空闲空间百分比

		Pattern p = Pattern.compile("vfs\\.fs\\.size\\[(.+),pfree\\]");
		Matcher matcher = p.matcher(key);

		if (matcher.matches()) {
			System.out.println(matcher.groupCount());
			System.out.println(matcher.group(0));
			System.out.println(matcher.group(1));

			System.out.println("$1上空闲空间百分比".replace("$1", "[" + matcher.group(1) + "]"));
		}

		key = "net.if.out[rename7]";
		// 网卡$1的流出流量bps

		p = Pattern.compile("net\\.if\\.out\\[(.+)\\]");
		matcher = p.matcher(key);

		if (matcher.matches()) {
			System.out.println(matcher.groupCount());
			System.out.println(matcher.group(0));
			System.out.println(matcher.group(1));

			System.out.println("网卡$1的流出流量bps".replace("$1", "[" + matcher.group(1) + "]"));
		}

		key = "net.if.in[rename7]";
		// 网卡$1的流入流量bps

		p = Pattern.compile("net\\.if\\.in\\[(.+)\\]");
		matcher = p.matcher(key);

		if (matcher.matches()) {
			System.out.println(matcher.groupCount());
			System.out.println(matcher.group(0));
			System.out.println(matcher.group(1));

			System.out.println("网卡$1的流入流量bps".replace("$1", "[" + matcher.group(1) + "]"));
		}

	}
}
