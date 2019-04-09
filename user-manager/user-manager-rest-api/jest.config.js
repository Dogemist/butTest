module.exports = {
  preset: 'ts-jest',
  testEnvironment: 'node',
  moduleNameMapper: {
    '^@src/(.*)$': '<rootDir>/src/$1',
  },
  testMatch: [
		'<rootDir>/test/**/*.spec.(ts|js)'
  ],
  setupTestFrameworkScriptFile: '<rootDir>/test/init.ts',
};
