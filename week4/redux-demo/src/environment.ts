const dev = {
  context: 'http://localhost:3001/'
}

const prod = {
  context: 'http://google.com/'
}

export const environment = process.env.NODE_ENV === 'production'
  ? prod
  : dev