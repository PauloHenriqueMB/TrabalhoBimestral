package br.anotacoes;

public @interface Coluna {
	String nome() default "";
	boolean pk() default false;
}
