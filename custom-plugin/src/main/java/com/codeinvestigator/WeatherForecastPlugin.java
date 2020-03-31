package com.codeinvestigator;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="weatherforecastTomorrow", defaultPhase = LifecyclePhase.GENERATE_RESOURCES)
public class WeatherForecastPlugin extends AbstractMojo {

    @Parameter(defaultValue = "NotSet")
    private String forecast;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("*** weatherforecastTomorrow plugin BEGIN");
        getLog().info("The forecast for tomorrow is: "+forecast);
        getLog().info("*** weatherforecast Tomorrow plugin END");
    }
}
