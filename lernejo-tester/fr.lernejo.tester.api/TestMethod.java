
public @interface TestMethod {

    @Retention(RetentionPolicy.RUNTIME) // (1)
    @Target(ElementType.METHOD) // (2)

}
