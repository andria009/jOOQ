/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2926 extends org.jooq.impl.TableImpl<org.jooq.test.mysql.generatedclasses.tables.records.T_2926Record> {

	private static final long serialVersionUID = 1914068842;

	/**
	 * The singleton instance of <code>test.t_2926</code>
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.T_2926 T_2926 = new org.jooq.test.mysql.generatedclasses.tables.T_2926();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.T_2926Record> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.T_2926Record.class;
	}

	/**
	 * The column <code>test.t_2926.t1</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.T_2926Record, java.lang.String> T1 = createField("t1", org.jooq.impl.SQLDataType.CLOB.length(255), T_2926);

	/**
	 * The column <code>test.t_2926.t2</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.T_2926Record, java.lang.String> T2 = createField("t2", org.jooq.impl.SQLDataType.CLOB.length(65535), T_2926);

	/**
	 * The column <code>test.t_2926.t3</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.T_2926Record, java.lang.String> T3 = createField("t3", org.jooq.impl.SQLDataType.CLOB.length(16777215), T_2926);

	/**
	 * The column <code>test.t_2926.t4</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.T_2926Record, java.lang.String> T4 = createField("t4", org.jooq.impl.SQLDataType.CLOB, T_2926);

	/**
	 * No further instances allowed
	 */
	private T_2926() {
		super("t_2926", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}
}
