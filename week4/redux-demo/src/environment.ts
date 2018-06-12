const dev = {
  context: 'http://localhost:3001/'
}

const prod = {
  context: 'http://ec2-54-164-83-42.compute-1.amazonaws.com:3001/'
}

export const environment = process.env.NODE_ENV === 'production'
  ? prod
  : dev