package com.datalinkx.compute.connector.jdbc;

import com.datalinkx.compute.model.PluginNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MySQLSink extends PluginNode {
    private String url;
    private String driver;
    private String user;
    private String password;
    private String query;
}