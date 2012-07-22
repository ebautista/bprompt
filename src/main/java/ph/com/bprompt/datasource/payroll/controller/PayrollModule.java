package ph.com.bprompt.datasource.payroll.controller;

import com.google.inject.AbstractModule;

public class PayrollModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Person.class);
        bind(SampleController.class);
    }
}
