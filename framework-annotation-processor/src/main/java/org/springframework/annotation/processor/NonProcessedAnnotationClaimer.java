package org.springframework.annotation.processor;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * This annotation processor claims all the annotations that are not processed at compile time at all.
 * Otherwise, the compiler would emit a warning that
 * {@code No processor claimed any of these annotations}. Adding this to the compiler arg option {@code -Werror},
 * would fail the build.
 */
@SupportedAnnotationTypes({
		"com.oracle.svm.core.annotate.Alias",
		"com.oracle.svm.core.annotate.Substitute",
		"com.oracle.svm.core.annotate.TargetClass",
		"jakarta.annotation.Generated",
		"javax.annotation.CheckForNull",
		"javax.annotation.Nonnull",
		"javax.annotation.meta.TypeQualifierDefault",
		"javax.annotation.meta.TypeQualifierNickname",
		"jdk.jfr/jdk.jfr.Category",
		"jdk.jfr/jdk.jfr.Description",
		"jdk.jfr/jdk.jfr.Enabled",
		"jdk.jfr/jdk.jfr.Label",
		"jdk.jfr/jdk.jfr.Registered",
		"jdk.jfr/jdk.jfr.StackTrace",
		"org.jspecify.annotations.NullMarked",
		"org.jspecify.annotations.NullUnmarked",
		"org.springframework.aot.hint.annotation.Reflective",
		"org.springframework.aot.hint.annotation.RegisterReflection",
		"org.springframework.beans.factory.annotation.Autowired",
		"org.springframework.beans.factory.annotation.Qualifier",
		"org.springframework.context.annotation.Bean",
		"org.springframework.context.annotation.Configuration",
		"org.springframework.context.annotation.Import",
		"org.springframework.context.annotation.ImportRuntimeHints",
		"org.springframework.core.annotation.AliasFor",
		"org.springframework.core.annotation.Order",
		"org.springframework.lang.Contract",
		"org.springframework.web.bind.annotation.ExceptionHandler"})
@SupportedSourceVersion(SourceVersion.RELEASE_21)
public class NonProcessedAnnotationClaimer extends AbstractProcessor {
	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		return true;
	}
}
