/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DebeziumSqlserverComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration getOrCreateConfiguration(DebeziumSqlserverComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumSqlserverComponent target = (DebeziumSqlserverComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": getOrCreateConfiguration(target).setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "columnblacklist":
        case "columnBlacklist": getOrCreateConfiguration(target).setColumnBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "columnwhitelist":
        case "columnWhitelist": getOrCreateConfiguration(target).setColumnWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration.class, value)); return true;
        case "converters": getOrCreateConfiguration(target).setConverters(property(camelContext, java.lang.String.class, value)); return true;
        case "databasedbname":
        case "databaseDbname": getOrCreateConfiguration(target).setDatabaseDbname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistory":
        case "databaseHistory": getOrCreateConfiguration(target).setDatabaseHistory(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": getOrCreateConfiguration(target).setDatabaseHistoryFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkabootstrapservers":
        case "databaseHistoryKafkaBootstrapServers": getOrCreateConfiguration(target).setDatabaseHistoryKafkaBootstrapServers(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkarecoveryattempts":
        case "databaseHistoryKafkaRecoveryAttempts": getOrCreateConfiguration(target).setDatabaseHistoryKafkaRecoveryAttempts(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkarecoverypollintervalms":
        case "databaseHistoryKafkaRecoveryPollIntervalMs": getOrCreateConfiguration(target).setDatabaseHistoryKafkaRecoveryPollIntervalMs(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkatopic":
        case "databaseHistoryKafkaTopic": getOrCreateConfiguration(target).setDatabaseHistoryKafkaTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehostname":
        case "databaseHostname": getOrCreateConfiguration(target).setDatabaseHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasepassword":
        case "databasePassword": getOrCreateConfiguration(target).setDatabasePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseport":
        case "databasePort": getOrCreateConfiguration(target).setDatabasePort(property(camelContext, int.class, value)); return true;
        case "databaseservername":
        case "databaseServerName": getOrCreateConfiguration(target).setDatabaseServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseservertimezone":
        case "databaseServerTimezone": getOrCreateConfiguration(target).setDatabaseServerTimezone(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseuser":
        case "databaseUser": getOrCreateConfiguration(target).setDatabaseUser(property(camelContext, java.lang.String.class, value)); return true;
        case "decimalhandlingmode":
        case "decimalHandlingMode": getOrCreateConfiguration(target).setDecimalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": getOrCreateConfiguration(target).setEventProcessingFailureHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": getOrCreateConfiguration(target).setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": getOrCreateConfiguration(target).setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "includeschemachanges":
        case "includeSchemaChanges": getOrCreateConfiguration(target).setIncludeSchemaChanges(property(camelContext, boolean.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": getOrCreateConfiguration(target).setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": getOrCreateConfiguration(target).setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": getOrCreateConfiguration(target).setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": getOrCreateConfiguration(target).setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "messagekeycolumns":
        case "messageKeyColumns": getOrCreateConfiguration(target).setMessageKeyColumns(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": getOrCreateConfiguration(target).setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": getOrCreateConfiguration(target).setOffsetCommitTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": getOrCreateConfiguration(target).setOffsetFlushIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetstorage":
        case "offsetStorage": getOrCreateConfiguration(target).setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": getOrCreateConfiguration(target).setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": getOrCreateConfiguration(target).setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": getOrCreateConfiguration(target).setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": getOrCreateConfiguration(target).setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms":
        case "pollIntervalMs": getOrCreateConfiguration(target).setPollIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "providetransactionmetadata":
        case "provideTransactionMetadata": getOrCreateConfiguration(target).setProvideTransactionMetadata(property(camelContext, boolean.class, value)); return true;
        case "sanitizefieldnames":
        case "sanitizeFieldNames": getOrCreateConfiguration(target).setSanitizeFieldNames(property(camelContext, boolean.class, value)); return true;
        case "skippedoperations":
        case "skippedOperations": getOrCreateConfiguration(target).setSkippedOperations(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": getOrCreateConfiguration(target).setSnapshotDelayMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": getOrCreateConfiguration(target).setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotisolationmode":
        case "snapshotIsolationMode": getOrCreateConfiguration(target).setSnapshotIsolationMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": getOrCreateConfiguration(target).setSnapshotLockTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotmode":
        case "snapshotMode": getOrCreateConfiguration(target).setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": getOrCreateConfiguration(target).setSnapshotSelectStatementOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcestructversion":
        case "sourceStructVersion": getOrCreateConfiguration(target).setSourceStructVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcetimestampmode":
        case "sourceTimestampMode": getOrCreateConfiguration(target).setSourceTimestampMode(property(camelContext, java.lang.String.class, value)); return true;
        case "tableblacklist":
        case "tableBlacklist": getOrCreateConfiguration(target).setTableBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": getOrCreateConfiguration(target).setTableIgnoreBuiltin(property(camelContext, boolean.class, value)); return true;
        case "tablewhitelist":
        case "tableWhitelist": getOrCreateConfiguration(target).setTableWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "timeprecisionmode":
        case "timePrecisionMode": getOrCreateConfiguration(target).setTimePrecisionMode(property(camelContext, java.lang.String.class, value)); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": getOrCreateConfiguration(target).setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("additionalProperties", java.util.Map.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("columnBlacklist", java.lang.String.class);
        answer.put("columnWhitelist", java.lang.String.class);
        answer.put("configuration", org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration.class);
        answer.put("converters", java.lang.String.class);
        answer.put("databaseDbname", java.lang.String.class);
        answer.put("databaseHistory", java.lang.String.class);
        answer.put("databaseHistoryFileFilename", java.lang.String.class);
        answer.put("databaseHistoryKafkaBootstrapServers", java.lang.String.class);
        answer.put("databaseHistoryKafkaRecoveryAttempts", int.class);
        answer.put("databaseHistoryKafkaRecoveryPollIntervalMs", int.class);
        answer.put("databaseHistoryKafkaTopic", java.lang.String.class);
        answer.put("databaseHostname", java.lang.String.class);
        answer.put("databasePassword", java.lang.String.class);
        answer.put("databasePort", int.class);
        answer.put("databaseServerName", java.lang.String.class);
        answer.put("databaseServerTimezone", java.lang.String.class);
        answer.put("databaseUser", java.lang.String.class);
        answer.put("decimalHandlingMode", java.lang.String.class);
        answer.put("eventProcessingFailureHandlingMode", java.lang.String.class);
        answer.put("heartbeatIntervalMs", int.class);
        answer.put("heartbeatTopicsPrefix", java.lang.String.class);
        answer.put("includeSchemaChanges", boolean.class);
        answer.put("internalKeyConverter", java.lang.String.class);
        answer.put("internalValueConverter", java.lang.String.class);
        answer.put("maxBatchSize", int.class);
        answer.put("maxQueueSize", int.class);
        answer.put("messageKeyColumns", java.lang.String.class);
        answer.put("offsetCommitPolicy", java.lang.String.class);
        answer.put("offsetCommitTimeoutMs", long.class);
        answer.put("offsetFlushIntervalMs", long.class);
        answer.put("offsetStorage", java.lang.String.class);
        answer.put("offsetStorageFileName", java.lang.String.class);
        answer.put("offsetStoragePartitions", int.class);
        answer.put("offsetStorageReplicationFactor", int.class);
        answer.put("offsetStorageTopic", java.lang.String.class);
        answer.put("pollIntervalMs", long.class);
        answer.put("provideTransactionMetadata", boolean.class);
        answer.put("sanitizeFieldNames", boolean.class);
        answer.put("skippedOperations", java.lang.String.class);
        answer.put("snapshotDelayMs", long.class);
        answer.put("snapshotFetchSize", int.class);
        answer.put("snapshotIsolationMode", java.lang.String.class);
        answer.put("snapshotLockTimeoutMs", long.class);
        answer.put("snapshotMode", java.lang.String.class);
        answer.put("snapshotSelectStatementOverrides", java.lang.String.class);
        answer.put("sourceStructVersion", java.lang.String.class);
        answer.put("sourceTimestampMode", java.lang.String.class);
        answer.put("tableBlacklist", java.lang.String.class);
        answer.put("tableIgnoreBuiltin", boolean.class);
        answer.put("tableWhitelist", java.lang.String.class);
        answer.put("timePrecisionMode", java.lang.String.class);
        answer.put("tombstonesOnDelete", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DebeziumSqlserverComponent target = (DebeziumSqlserverComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return getOrCreateConfiguration(target).getAdditionalProperties();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "columnblacklist":
        case "columnBlacklist": return getOrCreateConfiguration(target).getColumnBlacklist();
        case "columnwhitelist":
        case "columnWhitelist": return getOrCreateConfiguration(target).getColumnWhitelist();
        case "configuration": return target.getConfiguration();
        case "converters": return getOrCreateConfiguration(target).getConverters();
        case "databasedbname":
        case "databaseDbname": return getOrCreateConfiguration(target).getDatabaseDbname();
        case "databasehistory":
        case "databaseHistory": return getOrCreateConfiguration(target).getDatabaseHistory();
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": return getOrCreateConfiguration(target).getDatabaseHistoryFileFilename();
        case "databasehistorykafkabootstrapservers":
        case "databaseHistoryKafkaBootstrapServers": return getOrCreateConfiguration(target).getDatabaseHistoryKafkaBootstrapServers();
        case "databasehistorykafkarecoveryattempts":
        case "databaseHistoryKafkaRecoveryAttempts": return getOrCreateConfiguration(target).getDatabaseHistoryKafkaRecoveryAttempts();
        case "databasehistorykafkarecoverypollintervalms":
        case "databaseHistoryKafkaRecoveryPollIntervalMs": return getOrCreateConfiguration(target).getDatabaseHistoryKafkaRecoveryPollIntervalMs();
        case "databasehistorykafkatopic":
        case "databaseHistoryKafkaTopic": return getOrCreateConfiguration(target).getDatabaseHistoryKafkaTopic();
        case "databasehostname":
        case "databaseHostname": return getOrCreateConfiguration(target).getDatabaseHostname();
        case "databasepassword":
        case "databasePassword": return getOrCreateConfiguration(target).getDatabasePassword();
        case "databaseport":
        case "databasePort": return getOrCreateConfiguration(target).getDatabasePort();
        case "databaseservername":
        case "databaseServerName": return getOrCreateConfiguration(target).getDatabaseServerName();
        case "databaseservertimezone":
        case "databaseServerTimezone": return getOrCreateConfiguration(target).getDatabaseServerTimezone();
        case "databaseuser":
        case "databaseUser": return getOrCreateConfiguration(target).getDatabaseUser();
        case "decimalhandlingmode":
        case "decimalHandlingMode": return getOrCreateConfiguration(target).getDecimalHandlingMode();
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return getOrCreateConfiguration(target).getEventProcessingFailureHandlingMode();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return getOrCreateConfiguration(target).getHeartbeatIntervalMs();
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return getOrCreateConfiguration(target).getHeartbeatTopicsPrefix();
        case "includeschemachanges":
        case "includeSchemaChanges": return getOrCreateConfiguration(target).isIncludeSchemaChanges();
        case "internalkeyconverter":
        case "internalKeyConverter": return getOrCreateConfiguration(target).getInternalKeyConverter();
        case "internalvalueconverter":
        case "internalValueConverter": return getOrCreateConfiguration(target).getInternalValueConverter();
        case "maxbatchsize":
        case "maxBatchSize": return getOrCreateConfiguration(target).getMaxBatchSize();
        case "maxqueuesize":
        case "maxQueueSize": return getOrCreateConfiguration(target).getMaxQueueSize();
        case "messagekeycolumns":
        case "messageKeyColumns": return getOrCreateConfiguration(target).getMessageKeyColumns();
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return getOrCreateConfiguration(target).getOffsetCommitPolicy();
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return getOrCreateConfiguration(target).getOffsetCommitTimeoutMs();
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return getOrCreateConfiguration(target).getOffsetFlushIntervalMs();
        case "offsetstorage":
        case "offsetStorage": return getOrCreateConfiguration(target).getOffsetStorage();
        case "offsetstoragefilename":
        case "offsetStorageFileName": return getOrCreateConfiguration(target).getOffsetStorageFileName();
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return getOrCreateConfiguration(target).getOffsetStoragePartitions();
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return getOrCreateConfiguration(target).getOffsetStorageReplicationFactor();
        case "offsetstoragetopic":
        case "offsetStorageTopic": return getOrCreateConfiguration(target).getOffsetStorageTopic();
        case "pollintervalms":
        case "pollIntervalMs": return getOrCreateConfiguration(target).getPollIntervalMs();
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return getOrCreateConfiguration(target).isProvideTransactionMetadata();
        case "sanitizefieldnames":
        case "sanitizeFieldNames": return getOrCreateConfiguration(target).isSanitizeFieldNames();
        case "skippedoperations":
        case "skippedOperations": return getOrCreateConfiguration(target).getSkippedOperations();
        case "snapshotdelayms":
        case "snapshotDelayMs": return getOrCreateConfiguration(target).getSnapshotDelayMs();
        case "snapshotfetchsize":
        case "snapshotFetchSize": return getOrCreateConfiguration(target).getSnapshotFetchSize();
        case "snapshotisolationmode":
        case "snapshotIsolationMode": return getOrCreateConfiguration(target).getSnapshotIsolationMode();
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": return getOrCreateConfiguration(target).getSnapshotLockTimeoutMs();
        case "snapshotmode":
        case "snapshotMode": return getOrCreateConfiguration(target).getSnapshotMode();
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": return getOrCreateConfiguration(target).getSnapshotSelectStatementOverrides();
        case "sourcestructversion":
        case "sourceStructVersion": return getOrCreateConfiguration(target).getSourceStructVersion();
        case "sourcetimestampmode":
        case "sourceTimestampMode": return getOrCreateConfiguration(target).getSourceTimestampMode();
        case "tableblacklist":
        case "tableBlacklist": return getOrCreateConfiguration(target).getTableBlacklist();
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": return getOrCreateConfiguration(target).isTableIgnoreBuiltin();
        case "tablewhitelist":
        case "tableWhitelist": return getOrCreateConfiguration(target).getTableWhitelist();
        case "timeprecisionmode":
        case "timePrecisionMode": return getOrCreateConfiguration(target).getTimePrecisionMode();
        case "tombstonesondelete":
        case "tombstonesOnDelete": return getOrCreateConfiguration(target).isTombstonesOnDelete();
        default: return null;
        }
    }
}

