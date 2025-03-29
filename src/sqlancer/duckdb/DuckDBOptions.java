package sqlancer.duckdb;

import java.util.Arrays;
import java.util.List;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import sqlancer.SQLOptions;

@Parameters(commandDescription = "DuckDB")
public class DuckDBOptions extends SQLOptions<DuckDBOracleFactory> {

    @Parameter(names = "--oracle")
    public List<DuckDBOracleFactory> oracles = Arrays.asList(DuckDBOracleFactory.QUERY_PARTITIONING);

    @Parameter(names = "--use-custom-script", description = "Use a custom script to generate database tables for testing")
    private String customScriptPath = null;

    public String getCustomScriptPath() {
        return customScriptPath;
    }

    @Override
    public List<DuckDBOracleFactory> getTestOracleFactory() {
        return oracles;
    }

}
