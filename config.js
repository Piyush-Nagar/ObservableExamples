module.exports = {
  hostRules: [
    {
      hostType: 'maven',
      matchHost: 'https://artifactory.yourcompany.com/',
      username: process.env.ARTIFACTORY_USERNAME,
      password: process.env.ARTIFACTORY_PASSWORD,
    },
  ],
};