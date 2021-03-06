package test;

import java.util.stream.Stream;

public final class EntryPoint {

	private EntryPoint() {
	}

	public static void main(final String... args) {
		runAs("stream", () -> Stream.of(args).map(String::toUpperCase).forEach(EntryPoint::dump));
	}

	private static void runAs(final String name, final Runnable runnable) {
		System.out.println("pre: " + name);
		runnable.run();
		out.println("post: " + name);
	}

	private static void dump(final Object o) {
		System.out.println(">" + o);
	}

}
